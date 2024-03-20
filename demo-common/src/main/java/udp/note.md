Windows系统下
netstat -an                               #查看所有连接
netstat -aop tcp                       #过滤tcp协议
netstat -aon | findstr 8800      #过滤端口  8800

Linux环境下
netstat -a                                 #查看所有连接
netstat -an                              #查看所有连接，不显示主机、端口和用户名
netstat -at                                #显示tcp连接
netstat -au                              #显示udp连接
netstat -an |grep ":8800"           #过滤端口8800
netstat -tunlp | grep ssh           #查找运行的进程
netstat -tunlp | grep 80 | awk '{print $7}' | cut -d/ -f1    #通过端口找进程id
netstat -l                                                             #处于监听listen状态的连接
netstat -pt                                            #显示pid和进程名字