#! /usr/bin/env python
import rospy
from std_msgs.msg import Empty
from ardrone_autonomy.msg import Navdata		

state = -1;

def ReceiveNavdata(data):
	global state
	state = data.state

rospy.init_node('cipek')
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

