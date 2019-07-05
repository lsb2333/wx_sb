#! /bin/bash

mvn install

cd weixin_sb_1
mvn spring-boot:start

cd ../subscribe_sb
mvn spring-boot:start

cd ../unsubscribe_sb
mvn spring-boot:start

cd ../self_menu_sb
mvn spring-boot:start

cd ../library_sb
mvn spring-boot:start
