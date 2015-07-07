#!/bin/sh

scalac -d classes Basics.scala
scala -cp classes Basics
