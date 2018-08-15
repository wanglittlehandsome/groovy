package test

import groovy.json.JsonSlurper

class JsonExpl {
    static void main(String[] args) {

        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}')

        println(object.name);
        println(object.ID);
    }
}
