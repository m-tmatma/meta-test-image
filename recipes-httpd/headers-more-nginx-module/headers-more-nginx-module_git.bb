# see https://yocto.yoctoproject.narkive.com/Q2AJtSDn/patch-nginx-module-add-ngx-http-auth-pam-module
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://README.markdown;md5=a544b5be63ad173fe62f239478c04aca"

SRC_URI = "git://github.com/openresty/headers-more-nginx-module;protocol=https"

PV = "0.33+git${SRCPV}"
SRCREV = "f85af9649b858e21b400a2150a4c7b8ebd36e921"

S = "${WORKDIR}/git"

SYSROOT_DIRS += "/${PN}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

# Nginx module is compiled as part of nginx build using --add-module,
# hence, just copy the sources here to be picked up by nginx later.
do_install () {
    cd ${S}
    git checkout-index -a --prefix=${D}/${PN}/
    cd -
}

FILES_${PN} += "${PN}/*"
FILES_${PN} += "${PN}/.*"

# fix
# ERROR: headers-more-nginx-module-0.33+gitAUTOINC+f85af9649b-r0 do_package_qa: QA Issue:
# /headers-more-nginx-module/util/build.sh contained in package headers-more-nginx-module
# requires /bin/bash, but no providers found in RDEPENDS_headers-more-nginx-module? [file-rdeps]
RDEPENDS_${PN} += "bash"

