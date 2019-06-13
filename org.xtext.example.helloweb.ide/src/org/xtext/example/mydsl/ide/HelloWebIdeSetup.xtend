/*
 * generated by Xtext 2.17.0
 */
package org.xtext.example.mydsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl.HelloWebRuntimeModule
import org.xtext.example.mydsl.HelloWebStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class HelloWebIdeSetup extends HelloWebStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new HelloWebRuntimeModule, new HelloWebIdeModule))
	}
	
}
