SUMMARY = "HTTP and reverse proxy server"

SRC_URI += "git://github.com/openresty/headers-more-nginx-module.git;protocol=https;branch=master"
SRCREV = "f85af9649b858e21b400a2150a4c7b8ebd36e921"

DEPENDS += "headers-more-nginx-module"

EXTRA_OECONF += " \
 --add-module=${STAGING_DIR_TARGET}/headers-more-nginx-module \
"
