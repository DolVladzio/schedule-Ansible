#!/bin/bash
set -euo pipefail
#########################################################################
ansible-playbook ingress_deploy.yml
	ansible-playbook app_deploy.yml \
	-e "frontend_image=$1 backend_image=$2 env=production"
#########################################################################