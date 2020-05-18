require recipes-core/android-system-image/android-system-image.inc

COMPATIBLE_MACHINE = "titan"

PV = "20200518-01"

#SRC_URI = "http://build.webos-ports.org/halium-luneos-7.1/halium-luneos-7.1-${PV}-${MACHINE}.tar.bz2"
SRC_URI = "https://www.dropbox.com/s/z6kd4h54s4830y4/halium-7.1-20200518-01-titan.tar.gz?dl=0"
SRC_URI[md5sum] = "4bd35e6ec86ef1a4598a2fd475e1cb50"
SRC_URI[sha256sum] = "128c6f513b24345b7604a87d57ad71782525c2d8c303f57560c01f0e4b1ca056"
