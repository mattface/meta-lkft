SUMMARY = "Linux Kernel Selftests (linux-kselftest next)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
PV = "5.1+git${SRCPV}"
SRCREV = "${AUTOREV}"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/next/linux-next.git;protocol=https;branch=master;name=kernel-next"
# Patches inappropriate or not yet merged by upstream
# Some patches may have been submitted to upstream
SRC_URI += "\
    file://0001-selftests-lib-allow-to-override-CC-in-the-top-level-Makefile.patch \
"

S = "${WORKDIR}/git"

export INSTALL_PATH = "/opt/kselftests/next"

require kselftests-common.inc
