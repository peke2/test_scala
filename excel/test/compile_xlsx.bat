@echo off

rem
rem Windows�ł̓N���X�̃p�X�������̏ꍇ�A��؂�Ƃ��āu;�v���g��(Linux�́u:�v)
rem �f�t�H���g�̐ݒ���㏑������̂ŁA�K�v�Ȃ�΃J�����g�̃f�B���N�g���u.�v���p�X�ɒǉ�����
rem

rem scalac -d classes -classpath .;..\lib\poi\poi-3.12-20150511.jar;..\lib\poi\poi-ooxml-3.12-20150511.jar;..\lib\poi\ooxml-lib\xmlbeans-2.6.0.jar test_xlsx.scala
scalac -d classes -classpath .;..\lib\poi\*;..\lib\poi\ooxml-lib\* test_xlsx.scala
