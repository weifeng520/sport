// index.js
// 获取应用实例
const app = getApp()

Page({
  data: {},
  // 事件处理函数
  bindViewTap() {},
  onLoad() {
    var that = this
    wx.request({
      url: 'http://localhost:8080/test', //仅为示例，并非真实的接口地址
      data: {},
      header: {
        'content-type': 'application/json' // 默认值
      },
      success (res) {
        console.log(res.data)
        that.setData({
          info: res.data
        })
      }
    })
  }
})
