FILESEXTRAPATHS_append := "${THISDIR}/files:"

PACKAGECONFIG_CONFARGS = ""

SRC_URI += " \
    file://09-swupdate-args;md5=d41d8cd98f00b204e9800998ecf8427e \
    file://swupdate.cfg;md5=d41d8cd98f00b204e9800998ecf8427e \
    "

do_install_append() {
    install -m 0644 ${WORKDIR}/09-swupdate-args ${D}${libdir}/swupdate/conf.d/

    install -d ${D}${sysconfdir}
    install -m 644 ${WORKDIR}/swupdate.cfg ${D}${sysconfdir}
}
