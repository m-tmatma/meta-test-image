DESCRIPTION = "test"
require recipes-core/images/core-image-minimal.bb

EXTRA_IMAGE_FEATURES = "\
    package-management \
"

IMAGE_INSTALL = " \
    coreutils \
    kernel-modules \
"
