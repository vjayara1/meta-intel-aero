SUMMARY = "Development and verification tools"
LICENSE = "MIT"

inherit packagegroup

PR = "r0"

RDEPENDS_${PN} = "\
		i2c-tools \
		devmem2 \
		screen \
		lsof \
		strace \
		"
