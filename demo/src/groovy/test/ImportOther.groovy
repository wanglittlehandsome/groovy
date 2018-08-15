package test

import groovy.xml.MarkupBuilder

class ImportOther {

     static void main(String[] args) {
         def range  = 5..10
         int i = 0
         while(true){
             if(range.size() == i + 1){
                 break
             }else{
                 println("this is range's :" + range.get(i))
             }
             i++
         }
         println(range);
         println(range.get(2));
     }

    def xml = new MarkupBuilder()
}
