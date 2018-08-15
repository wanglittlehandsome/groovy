package core

import common.Query


class ExportExpress implements Export{

    @Override
    void export() {
        List<GroovyObject> list = Query.queryList("SELECT * FROM tb_global_express");
        list.each {
            obj -> println "${obj}"
        }
    }
}
