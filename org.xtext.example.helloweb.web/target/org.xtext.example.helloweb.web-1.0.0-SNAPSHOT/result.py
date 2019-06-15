#! /usr/bin/env python
import sys
sys.path.append('/opt/ros/indigo/lib/python2.7/dist-packages')
import rospy

from std_msgs.msg import Empty
from ardrone_autonomy.msg import Navdata		

#Empty = imp.load_source('std_msgs.msg.Empty', '/opt/ros/indigo/share/std_msgs')
import rosgraph

state = -1;
print(rosgraph)
print("IN")
print(rospy)

def ReceiveNavdata(data):
	global state
	state = data.state

rospy.init_node('test_node')
empty = Empty()
rospy.Subscriber('/ardrone/navdata', Navdata, ReceiveNavdata)

while state == -1:
	rospy.sleep(0.1)

if state == 0:
	reset = rospy.Publisher('/ardrone/reset', Empty, queue_size=1)
	while reset.get_num_connections() < 1:
		rospy.sleep(0.1)
	reset.publish(empty)

while state == 0:
	rospy.sleep(0.1)

takeoff = rospy.Publisher('/ardrone/takeoff', Empty, queue_size=1)

while takeoff.get_num_connections() < 1:
	rospy.sleep(0.1)

takeoff.publish(empty)
rospy.sleep(5)

land = rospy.Publisher('/ardrone/land', Empty, queue_size=1)
			
while land.get_num_connections() < 1:
	rospy.sleep(0.1)

land.publish(empty)

