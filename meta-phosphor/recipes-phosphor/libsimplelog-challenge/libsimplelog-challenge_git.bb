
SUMMARY = "simplelog-challenge - Simple, STABLE, powerful of logging library in ANSI C/C++. Ready for billion records."
DESCRIPTION = "Async and Fast C/C++ multi-thread/processes logger with topics. No external dependencies."
HOMEPAGE = "https://github.com/thuanalg/simplelog-challenge"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=22cdd382a6275cb4c2e75c517952ac7c"

SRC_URI = "git://git@github.com/thuanalg/simplelog-challenge.git;branch=main;protocol=https"

PV = "1.0.1+git"
SRCREV = "a920ed722ac05644c318c6db459a8fce68377d05"

S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE += "-DUNIX_LINUX=1"


