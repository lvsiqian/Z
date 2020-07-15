package com.example.yuekao;

import java.util.List;

public class Bean {

    /**
     * data : {"curPage":2,"datas":[{"title":"Kotlin 新版来了，支持跨平台！","link":"https://mp.weixin.qq.com/s/VBYLs5Mv6el58oSkGkWSkA"},{"title":"【AAC 系列二】深入理解架构组件的基石：Lifecycle","link":"https://mp.weixin.qq.com/s/8vuOj8JnGk-hwl5AU2itkQ"},{"title":"学最好的技术 进更好的公司 | 各大互联网公司技术分享","link":"https://mp.weixin.qq.com/s/WMsLuc7sktL952I-29EPyg"},{"title":"玩安卓微信小程序","link":"http://www.wanandroid.com/blog/show/2572"},{"title":"wanAndroid学习项目","link":"http://www.wanandroid.com/blog/show/2569"},{"title":"Kotlin  高德地图 仿微信 发送位置","link":"http://www.wanandroid.com/blog/show/2567"},{"title":"Linkage-RecyclerView：即使不用饿了么，也请不要错过这个库！","link":"http://www.wanandroid.com/blog/show/2564"},{"title":"自定义View实现一个好用的日期时间选择器","link":"http://www.wanandroid.com/blog/show/2565"},{"title":"Transferee 帮助你完成从缩略图到原图的无缝过渡转变","link":"http://www.wanandroid.com/blog/show/2562"},{"title":"知乎技术专栏","link":"https://zhuanlan.zhihu.com/hackers"},{"title":"网易云音乐开发组","link":"https://zhuanlan.zhihu.com/p/56086941"},{"title":"Android 进阶探索 为什么别人成长那么快？","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"【AAC 系列一】Android 应用架构新时代来临！","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"Android Gradle 干货","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"最近 Flutter 争气了！ Flutter 也可以做这么炫酷的动画","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"面试加分项：RecyclerView全面的源码解析","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"拥抱RxJava（番外篇）：关于RxJava的Tips &amp; Tricks","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"一篇不太一样的RxJava介绍","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"我为什么不再推荐RxJava","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"【源码阅读】AndPermission源码阅读","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"}]}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 2
         * datas : [{"title":"Kotlin 新版来了，支持跨平台！","link":"https://mp.weixin.qq.com/s/VBYLs5Mv6el58oSkGkWSkA"},{"title":"【AAC 系列二】深入理解架构组件的基石：Lifecycle","link":"https://mp.weixin.qq.com/s/8vuOj8JnGk-hwl5AU2itkQ"},{"title":"学最好的技术 进更好的公司 | 各大互联网公司技术分享","link":"https://mp.weixin.qq.com/s/WMsLuc7sktL952I-29EPyg"},{"title":"玩安卓微信小程序","link":"http://www.wanandroid.com/blog/show/2572"},{"title":"wanAndroid学习项目","link":"http://www.wanandroid.com/blog/show/2569"},{"title":"Kotlin  高德地图 仿微信 发送位置","link":"http://www.wanandroid.com/blog/show/2567"},{"title":"Linkage-RecyclerView：即使不用饿了么，也请不要错过这个库！","link":"http://www.wanandroid.com/blog/show/2564"},{"title":"自定义View实现一个好用的日期时间选择器","link":"http://www.wanandroid.com/blog/show/2565"},{"title":"Transferee 帮助你完成从缩略图到原图的无缝过渡转变","link":"http://www.wanandroid.com/blog/show/2562"},{"title":"知乎技术专栏","link":"https://zhuanlan.zhihu.com/hackers"},{"title":"网易云音乐开发组","link":"https://zhuanlan.zhihu.com/p/56086941"},{"title":"Android 进阶探索 为什么别人成长那么快？","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"【AAC 系列一】Android 应用架构新时代来临！","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"Android Gradle 干货","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"最近 Flutter 争气了！ Flutter 也可以做这么炫酷的动画","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"面试加分项：RecyclerView全面的源码解析","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"拥抱RxJava（番外篇）：关于RxJava的Tips &amp; Tricks","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"一篇不太一样的RxJava介绍","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"我为什么不再推荐RxJava","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"},{"title":"【源码阅读】AndPermission源码阅读","link":"https://mp.weixin.qq.com/s/8X5MqbRlwQAX10-a6OeOvQ"}]
         */

        private int curPage;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * title : Kotlin 新版来了，支持跨平台！
             * link : https://mp.weixin.qq.com/s/VBYLs5Mv6el58oSkGkWSkA
             */

            private String title;
            private String link;
            private  String time;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }
    }
}
