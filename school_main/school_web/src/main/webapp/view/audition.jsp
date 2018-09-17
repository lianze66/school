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
    <title>听听</title>
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

            <div class="cont">
              <div class="crad-audition">

                <div class="card">
                    <div class="card-main">
                      <dl class="card-dl">
                        <dt><img src="https://img.t.sinajs.cn/t5/skin/public/profile_cover/001_s.jpg" /></dt>
                        <dd><em class="m-text-cut">python使用正则表达式文本替换</em></dd>
                        <dd>
                          <p class="m-text-cut-2">2D客户端编程从某种意义上来讲就是素材组织，所以，图片素材组织经常需要批量处理,python一定是最佳选择，不管是win/linux/mac都有一个简单的运行环境...</p>
                        </dd>
                        <dd class="cdd-info">
                          <span class="fn-left"><i>金牌教师：</i>张学友</span>
                          <span class="fn-right"><font class="fn-text-red">进行中</font></span>
                        </dd>
                        <dd>
                          <span class="fn-left"><i class="m-icon m-icon-time-gray"></i>时长：340分钟</span>
                          <span class="fn-right">2018-06-21</span>
                        </dd>
                      </dl>
                    </div>
                </div>

                <div class="card card-disabled">
                    <div class="card-main">
                      <dl class="card-dl">
                        <dt><img src="https://img.t.sinajs.cn/t5/skin/public/profile_cover/001_s.jpg" /></dt>
                        <dd><em class="m-text-cut">python使用正则表达式文本替换</em></dd>
                        <dd>
                          <p class="m-text-cut-2">2D客户端编程从某种意义上来讲就是素材组织，所以，图片素材组织经常需要批量处理,python一定是最佳选择，不管是win/linux/mac都有一个简单的运行环境...</p>
                        </dd>
                        <dd class="cdd-info">
                          <span class="fn-left"><i>金牌教师：</i>张学友</span>
                          <span class="fn-right"><font>已过期</font></span>
                        </dd>
                        <dd>
                          <span class="fn-left"><i class="m-icon m-icon-time-gray"></i>时长：340分钟</span>
                          <span class="fn-right">2018-06-21</span>
                        </dd>
                      </dl>
                    </div>
                </div>

              </div>

              <div class="card-load">
                  <a href="#">点击加载更多</a>
              </div>

            </div>
          </div>
      </div>
  </body>
</html>