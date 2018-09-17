<%@page contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="renderer" content="webkit" />
    <meta name="keywords" content="适学"/>
    <meta name="description" content="适学"/>
    <meta name="apple-mobile-web-app-title" content="">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black" />
    <meta id="viewport" name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no,minimal-ui">
    <title>留言</title>
    <!--开发环境-->
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/view/styles/base.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/view/styles/main.css" />
    <script type="text/javascript" src="<%=request.getContextPath()%>/view/js/ios.js"></script>
  </head>
  <body>
      <div class="wrapper">
          <div class="view">
            <div class="head-fixed">    
                <div class="top-bar m-box">
                    <div class="m-box-left m-box-col m-box-center-a">
                      <h1>适学</h1>
                    </div>
                    <div class="m-box-right m-box-center-a">
                        <i class="m-icon m-icon-phone"></i>
                        <span>联系我们</span>
                    </div>
                </div>
                
                <jsp:include page="_menu.jsp"></jsp:include>
                
            </div>
            <div class="cont cont-gray">
              <!--msg-->
              <div class="card-msg">
                  <div class="card-msg-wrap m-panel">
                    <div class="card-msg-list">
                      <div class="card-msg-box m-box">
                          <div class="cmb-left"><span>内蒙古</span></div>
                          <div class="cmb-right m-box-col">
                              <dl>
                                <dt>
                                  <em class="m-text-cut">Chrome59到底支不支到底支不支到底支不支持forEach函数？</em>
                                  <p>来自火箭的学员</p>
                                </dt>
                                <dd>
                                  <p>把sum放到前面初始化运行是合计为空，是不是js按循序运行的？？求解</p>
                                </dd>
                              </dl>
                              <div class="cmb-reply">
                                  <em>管理员：</em>支不支到底支不支到底支不支持forE,把sum放到前面初始化运行是合计...
                              </div>
                          </div>
                      </div>

                      <div class="card-msg-box m-box">
                          <div class="cmb-left"><span>北京</span></div>
                          <div class="cmb-right m-box-col">
                              <dl>
                                <dt>
                                  <em class="m-text-cut">Chrome59到底支不支到底支不支到底支不支持forEach函数？</em>
                                  <p>来自火箭的学员</p>
                                </dt>
                                <dd>
                                  <p>把sum放到前面初始化运行是合计为空，是不是js按循序运行的？？求解</p>
                                </dd>
                              </dl>
                          </div>
                      </div>

                      <div class="card-msg-box m-box">
                          <div class="cmb-left"><span>北京</span></div>
                          <div class="cmb-right m-box-col">
                            <dl>
                                <dt>
                                  <em class="m-text-cut">Chrome59到底支不支到底支不支到底支不支持forEach函数？</em>
                                  <p>来自火箭的学员</p>
                                </dt>
                                <dd>
                                  <p>把sum放到前面初始化运行是合计为空，是不是js按循序运行的？？求解</p>
                                </dd>
                              </dl>
                          </div>
                      </div>

                    </div>
                  </div>
              </div>
              <!--msg==end-->
            </div>
            <!--foo-fixed-active-->
            <div class="foo-fixed">
                <span>给我们留言</span>
                <!--foo-panel-->
                <div class="foo-panel">
                    <h3>给我们留言<span>关闭</span></h3>
                    <dl>
                      <dt class="m-box">
                        <span class="m-box-col"><input type="text" placeholder="请输入标题" /></span>
                      </dt>
                      <dd class="m-box">
                        <span class="m-box-col">
                          <label class="m-textarea">
                            <textarea placeholder="在这里写下想对我们说的话吧～"></textarea>
                          </label>
                        </span>
                      </dd>
                    </dl>
                </div>
                <div class="foo-btn">
                    <span><a href="#">提交</a></span>
                    <span><a href="#">清空</a></span>
                </div>
            </div>
          </div>
      </div>
      <script type="text/javascript">
        ;(function(win,doc){
            var foofixed=doc.querySelector('.foo-fixed');
            var msgBtn=doc.querySelector('.foo-fixed>span');
            var msgClose=doc.querySelector('.foo-panel>h3>span');
            msgBtn.addEventListener('click',function(){
              foofixed.className="foo-fixed foo-fixed-active";
            },false);
            msgClose.addEventListener('click',function(){
              foofixed.className="foo-fixed";
            },false);
        })(window,document);
      </script>
  </body>
</html>