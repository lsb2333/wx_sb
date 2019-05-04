#! /bin/bash

mvn install

cd weixin_sb_1
mvn spring-boot:start

cd ../subscribe_sb
mvn spring-boot:start