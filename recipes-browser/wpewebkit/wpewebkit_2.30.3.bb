require wpewebkit.inc
require conf/include/devupstream.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI = "\
    https://wpewebkit.org/releases/${BPN}-${PV}.tar.xz \
    file://216455_builds_with_ENABLE_SERVICE_WORKER_OFF.patch \
    file://ICU-68.1-no-longer-exposes-FALSE-and-TRUE-macros-by-.patch \
"

SRC_URI[sha256sum] = "f2dfc1a6279810353f601bb9bd0d8ef671b41b38352d679b93d01631c2bf7b4b"

DEPENDS += " libwpe"
RCONFLICTS_${PN} = "libwpe (< 1.4) wpebackend-fdo (< 1.6)"

SRC_URI_class-devupstream = "git://git.webkit.org/WebKit.git;branch=main"
SRCREV_class-devupstream = "e6e27467d6902dd69161e24bc0fa85d517a65422"

