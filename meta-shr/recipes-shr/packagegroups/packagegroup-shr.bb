DESCRIPTION = "SHR Fat Image Feed"
PR = "r14"
PV = "2.0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RPROVIDES_${PN} += "task-shr"
RPROVIDES_${PN}-gtk += "task-shr-gtk"
RPROVIDES_${PN}-apps += "task-shr-apps"
RPROVIDES_${PN}-games += "task-shr-games"
RPROVIDES_${PN}-cli += "task-shr-cli"
RREPLACES_${PN} += "task-shr"
RREPLACES_${PN}-gtk += "task-shr-gtk"
RREPLACES_${PN}-apps += "task-shr-apps"
RREPLACES_${PN}-games += "task-shr-games"
RREPLACES_${PN}-cli += "task-shr-cli"
RCONFLICTS_${PN} += "task-shr"
RCONFLICTS_${PN}-gtk += "task-shr-gtk"
RCONFLICTS_${PN}-apps += "task-shr-apps"
RCONFLICTS_${PN}-games += "task-shr-games"
RCONFLICTS_${PN}-cli += "task-shr-cli"

PACKAGES = "\
  ${PN}-gtk \
  ${PN}-apps \
  ${PN}-games \
  ${PN}-cli \
"

RDEPENDS_${PN}-gtk = "\
  vagalume \
"

BROWSER = ""
# webkit-efl is currently broken
#BROWSER = "elbow"
#BROWSER_armv4 = ""
#BROWSER_armv5 = ""

# intone depends on blacklisted mplayer2

RDEPENDS_${PN}-apps += "\
  packagegroup-shr-minimal-apps \
  opimd-utils-notes \
  ${BROWSER} \
"
RDEPENDS_${PN}-cli += "\
  packagegroup-shr-minimal-cli \
  packagegroup-cli-tools-debug \
  packagegroup-cli-tools \
  rsync \
  openssh-sftp-server \
"

RDEPENDS_${PN}-games += "\
  numptyphysics \
"

PNBLACKLIST[packagegroup-shr] ?= "Runtime depends on blacklisted packagegroup-cli-tools-debug"

PNBLACKLIST[packagegroup-shr] ?= "Runtime depends on blacklisted packagegroup-shr-minimal-cli"

PNBLACKLIST[packagegroup-shr] ?= "Runtime depends on blacklisted packagegroup-cli-tools"

PNBLACKLIST[packagegroup-shr] ?= "Runtime depends on blacklisted packagegroup-shr-minimal-apps"

PNBLACKLIST[packagegroup-shr] ?= "Runtime depends on blacklisted vagalume"
