DESCRIPTION = "test"
require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "splash ssh-server-openssh"

IMAGE_INSTALL_append = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

IMAGE_INSTALL_append = " \
    coreutils \
    kernel-modules \
"

IMAGE_INSTALL_append = " \
    nginx \
"
