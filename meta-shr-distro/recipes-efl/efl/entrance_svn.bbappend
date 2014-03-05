FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_shr = " file://entrance.conf"

# replace default entrance.conf with autologin version
do_install_append_shr() {
        cp -a ${WORKDIR}/entrance.conf ${D}/${sysconfdir}/entrance.conf
}
