import core.Export
import core.ExportBank
import core.ExportExpress

class SqlExample {

    static void main(String[] args) {
        print("请输入执行命令：")
        def console=System.in.newReader().readLine()
        switch (console){
            case "bank":
                Export bank = new ExportBank()
                bank.export()
                break
            case "express":
                Export express = new ExportExpress()
                express.export()
                break
            default:
                print("输入命令有误!")
        }

    }





}
