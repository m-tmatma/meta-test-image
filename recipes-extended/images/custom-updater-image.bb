DESCRIPTION = "test"
require recipes-custom/images/custom-test-image.bb

#DEPENDS = "update-image"

do_mytask () {
    bbwarn "hogehoge: mytask  ${WORKDIR}"
    bbdebug 1 "custom-updater: do_install_append_test ${WORKDIR}"
}

addtask do_mytask  after do_rootfs before do_image
