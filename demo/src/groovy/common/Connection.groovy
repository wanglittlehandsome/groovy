package common

import groovy.sql.Sql

class Connection {

    static Sql getConnertion(){
        return  Sql.newInstance('jdbc:mysql://ip:3306/abk',
                'root', 'mysql@2018', 'com.mysql.jdbc.Driver')
    }


}
