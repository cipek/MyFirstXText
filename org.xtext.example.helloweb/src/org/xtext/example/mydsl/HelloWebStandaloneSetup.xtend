/*
 * generated by Xtext 2.17.0
 */
package org.xtext.example.mydsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class HelloWebStandaloneSetup extends HelloWebStandaloneSetupGenerated {

	def static void doSetup() {
		new HelloWebStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
