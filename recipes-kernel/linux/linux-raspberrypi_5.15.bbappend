FILESEXTRAPATHS:prepend:rpi := "${THISDIR}/files:"

SRC_URI:append:rpi = "\
    file://fragment.cfg \
"

SRC_URI:append:rpi = "\
    file://0001-add-log.patch \
    file://0002-add-log.patch \
    file://0003-add-log.patch \
"
