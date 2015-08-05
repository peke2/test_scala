@echo off

rem
rem Windowsではクラスのパスが複数の場合、区切りとして「;」を使う(Linuxは「:」)
rem デフォルトの設定を上書きするので、必要ならばカレントのディレクトリ「.」もパスに追加する
rem

rem scalac -d classes -classpath .;..\lib\poi\poi-3.12-20150511.jar;..\lib\poi\poi-ooxml-3.12-20150511.jar;..\lib\poi\ooxml-lib\xmlbeans-2.6.0.jar test_xlsx.scala
scalac -d classes -classpath .;..\lib\poi\*;..\lib\poi\ooxml-lib\* test_xlsx.scala
