# -*- mode: ruby -*-
# vi: set ft=ruby :
Vagrant.configure("2") do |config|
  config.vm.provider "virtualbox" do |vb|
    vb.customize ["modifyvm", :id, "--cpuexecutioncap", "50"]
  end
  config.vm.box = "pgdevbox"
  config.vm.box_url = "http://pgdevbox.com/pgdev.box"
  config.vm.network :forwarded_port, guest: 5432, host: 5432
end
