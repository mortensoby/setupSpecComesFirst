package tester

import grails.testing.mixin.integration.Integration
import setupspec.BootStrap
import spock.lang.Specification

@Integration
class WhatComesFirst extends Specification {

    static long bootstrapTime

    static long setupSpecTime

    def setupSpec(){
        setupSpecTime = System.currentTimeMillis()
    }

    def "setupSpec is executed before the application starts"() {
        expect: 'setupSpec is executed before the application is started'
            setupSpecTime < BootStrap.initTime
    }
}