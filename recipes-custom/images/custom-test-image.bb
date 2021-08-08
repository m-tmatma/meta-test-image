DESCRIPTION = "test"
require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL = " \
    coreutils \
    kernel-modules \
"

IMAGE_INSTALL_append = " \
    nginx \
"
