package common

import groovy.sql.Sql

class Query {

    static List<GroovyObject> queryList(String sql){
        Sql connection = Connection.getConnertion()
        List<GroovyObject> list =  connection.rows(sql)
        connection.close()
        return list
    }

    static GroovyObject queryOne(String sql){
        Sql connection = Connection.getConnertion()
        GroovyObject obj  = connection.firstRow(sql)
        connection.close()
        return obj
    }

}
