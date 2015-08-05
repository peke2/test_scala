#!/bin/sh

#コンパイルと実行のやり方
#クラスパスは指定しなくても良いが、classファイルと分離されている方がわかりやすい
scalac -d classes Hello.scala
scala -cp classes Hello
