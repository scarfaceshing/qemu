#!/bin/bash

ISO=archlinux-2024.05.01-x86_64.iso

# qemu-system-x86_64 -enable-kvm \
#     -bios /usr/share/ovmf/x64/OVMF.fd \
#     -cdrom $ISO \
#     -boot menu=on \
#     -drive file=Image.img \
#     -m 2G \
#     -cpu host \
#     -vga virtio \
#     -display sdl,gl=on \
#     -serial none \
#     -smp cores=2 \
#     -spice port=5900,disable-ticketing=on \
#     -device virtio-serial,chardev=spicechannel0,name=com.redhat.spice.0 \
#     -chardev spicevmc,id=spicechannel0,name=vdagent

qemu-system-x86_64 -enable-kvm \
    -cdrom $ISO \
    -boot menu=on \
    -drive file=Image.img \
    -m 2G \
    -cpu host \
    -vga virtio \
    -display sdl,gl=on \
    -serial none \
    -smp cores=2 \