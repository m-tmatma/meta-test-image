DESCRIPTION = "test"
require recipes-core/images/core-image-minimal.bb

PREFERRED_PROVIDER_u-boot-fw-utils = "libubootenv"

EXTRA_IMAGE_FEATURES = "\
    package-management \
"

IMAGE_INSTALL = " \
    coreutils \
    kernel-modules \
    swupdate \
    swupdate-www \
"
