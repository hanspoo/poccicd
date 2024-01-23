FROM welinux/libreoffice-es:2.0
COPY . /poccid
WORKDIR /poccid
RUN play precompile
CMD play run
