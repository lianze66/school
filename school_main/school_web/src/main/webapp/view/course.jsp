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
    <title>适学网-课程</title>
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
            <div class="course-wrap">
              <div class="course-top m-box">
                <div class="m-box-col">
                    <h3>基础</h3>
                    <h4>45课时</h4>
                </div>
                <div class="m-box-col">
                    <h3>高级</h3>
                    <h4>45课时</h4>
                </div>
                <div class="m-box-col">
                    <h3>实训</h3>
                    <h4>45课时</h4>
                </div>
              </div>
              <div class="course-main">
                  <div class="course-box m-panel">
                      <h3>一月</h3>
                      <div class="course-bar">
                        <dl>
                          <dt>
                            <em>第01天</em>
                            <i></i>
                            <span>java初体验</span>
                          </dt>
                          <dd>
                            <em>1个课时</em>
                            <span>java简介</span>
                          </dd>
                          <dd>
                            <em>4个课时</em>
                            <span>java开发环境搭建</span>
                          </dd>
                        </dl>
                        <dl>
                          <dt>
                            <em>第02天</em>
                            <i></i>
                            <span>java初体验</span>
                          </dt>
                          <dd>
                            <em>1个课时</em>
                            <span>java简介</span>
                          </dd>
                          <dd>
                            <em>4个课时</em>
                            <span>java开发环境搭建</span>
                          </dd>
                        </dl>
                      </div>
                  </div>
                  <div class="course-box m-panel">
                      <h3>二月</h3>
                      <div class="course-bar">
                        <dl>
                          <dt>
                            <em>第01天</em>
                            <i></i>
                            <span>java初体验</span>
                          </dt>
                          <dd>
                            <em>1个课时</em>
                            <span>java简介</span>
                          </dd>
                          <dd>
                            <em>4个课时</em>
                            <span>java开发环境搭建</span>
                          </dd>
                        </dl>
                      </div>
                  </div>
              </div>
            </div>

          </div>
        </div>
      </div>
    </body>
  </html>