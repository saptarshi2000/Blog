package com.saptarshisamanta.blog.data

import com.saptarshisamanta.blog.R

data class Post(
    var _ID:String,
    //val profile_pic:String,
    var name:String,
    val post:String,
    val post_pic:String ,
    var fav_count:Int,
    var comment_count:Int)