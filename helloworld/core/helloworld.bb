DESCRIPTION = "Prints Hello World"                                                     
PN = 'helloworld'
PV = '1'
python do_build() {   
    '注意如果-c没指定task 默认执行 build'
    bb.plain("********************");
    bb.plain("*                  *");
    bb.plain("*  Hello, World! this is core   *");
    bb.plain("*                  *");
    bb.plain("********************");
}
python do_install() {   
    bb.plain("*  install           *");
}
python do_clean() {   
    bb.plain("********************");
    bb.plain("*                  *");
    bb.plain("*  clean    core       *");
    bb.plain("*                  *");
    bb.plain("********************");
}
