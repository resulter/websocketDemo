【注：】原作者githttps://github.com/niezhiliang/springbootwebsocket.git
    本项目在此基础上进行了优化，如：发送的不只是单纯的一个string而是一个对象；用户连接/断开连接时的一些处理等


#### 服务端当前在线数和在线人不是异步的，接受客户端的信息是异步的，所有在所有用户连接完成后刷新一次服务端就好

- 支持给一人推送信息，多人推送以及全部推送 个人推送和多人推送只要在多选框选择要推送的人，然后点击发送  全部推送 只需点击全部发送就好


![演示gif](https://github.com/niezhiliang/springbootwebsocket/blob/master/demo.gif)
