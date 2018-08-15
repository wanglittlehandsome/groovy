package test

class ReadFile {

    static void main(String[] args){
        /*new File("D:\\QQ文件\\接收的文件\\新建文本文档.txt").eachLine {
            line -> println "line: $line"
        }*/

        //println new File("D:\\QQ文件\\接收的文件\\新建文本文档.txt").text

        /*new File("D:\\QQ文件\\接收的文件\\新建文本文档.txt").withWriter("utf-8"){
            writer -> writer.write "Hello World !"
        }*/

        /*File file = new File("D:\\QQ文件\\接收的文件\\新建文本文档.txt")
        println "${file.length()}"
        println "${file.getAbsolutePath()}"*/

       /* def rootFiles =  new File("D:\\QQ文件\\接收的文件\\新建文本文档.txt").listRoots()
        rootFiles.each {
            file -> println file.absolutePath
        }*/

        new File("D:").eachFileRecurse {
            file -> println file.getAbsolutePath()
        }
    }
}
