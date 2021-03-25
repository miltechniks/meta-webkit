require wpebackend-fdo.inc
require conf/include/devupstream.inc

# wpebackend-fdo uses meson since (not branched yet)
#   https://github.com/Igalia/WPEBackend-fdo/commit/9c13d73bcc3726e2290c182d76d67b384f4c1318
inherit meson

DEFAULT_PREFERENCE = "-1"

# These dependencies are needed since wpebackend-fdo>=1.8.X
# TODO: Promote it to the wpebackend-fdo.inc once wpebackend-fdo=1.6.1 is
# removed from this repo.
DEPENDS = "glib-2.0 libxkbcommon wayland libepoxy libwpe"

SRC_URI = "git://github.com/Igalia/WPEBackend-fdo.git;protocol=https;branch=master"
SRCREV = "04f7c227a2ba65656dbae16d545ce71d5970c920"
S = "${WORKDIR}/git"

SRC_URI_class-devupstream = "${SRC_URI}"
SRCREV_class-devupstream = "${SRCREV}"
