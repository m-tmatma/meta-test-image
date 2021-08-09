FILESEXTRAPATHS_prepend := "/home/yocto/meta-openembedded/meta-webserver/recipes-httpd/nginx/files:"
require recipes-httpd/nginx/nginx.inc

# 1.16.x branch is the current stable branch, the recommended default
# 1.17.x is the current mainline branches containing all new features
DEFAULT_PREFERENCE = "-1"

############################################################################################
# $ wget http://nginx.org/download/nginx-1.21.1.tar.gz
# $ md5sum LICENSE
# 206629dc7c7b3e87acb31162363ae505  LICENSE
############################################################################################
LIC_FILES_CHKSUM = "file://LICENSE;md5=206629dc7c7b3e87acb31162363ae505"

# remove the patch which is already applied to v1.21.1
# http://mailman.nginx.org/pipermail/nginx-announce/2021/000300.html
SRC_URI_remove = " \
    file://CVE-2021-23017.patch \
"

############################################################################################
# $ wget http://nginx.org/download/nginx-1.21.1.tar.gz
# $ md5sum nginx-1.21.1.tar.gz
# 7dce9e2136ec32dfd823736e871815b1  nginx-1.21.1.tar.gz
# $ sha256sum nginx-1.21.1.tar.gz
# 68ba0311342115163a0354cad34f90c05a7e8bf689dc498abf07899eda155560  nginx-1.21.1.tar.gz
############################################################################################
SRC_URI[md5sum] = "7dce9e2136ec32dfd823736e871815b1"
SRC_URI[sha256sum] = "68ba0311342115163a0354cad34f90c05a7e8bf689dc498abf07899eda155560"
