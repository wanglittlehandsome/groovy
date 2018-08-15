package core

import common.Query


class ExportBank implements Export{

    @Override
    void export() {
        List<GroovyObject> list = Query.queryList("SELECT * FROM tb_global_bank");
        list.each {
            obj -> println "${obj}"
        }
    }
}
