# 🐙 Schedule Deployment with Ansible 

App Deploy - [![Run The Ansible Role: App Deploy](https://github.com/DolVladzio/schedule-Ansible/actions/workflows/app_deploy.yml/badge.svg?branch=main)](https://github.com/DolVladzio/schedule-Ansible/actions/workflows/app_deploy.yml)

Restore DB - [![Run The Ansible Role: Restore DB](https://github.com/DolVladzio/schedule-Ansible/actions/workflows/restore_db.yml/badge.svg?branch=main)](https://github.com/DolVladzio/schedule-Ansible/actions/workflows/restore_db.yml)

This project uses Ansible to automate the deployment of a Kubernetes-based application, including app components (deployments, services, configmaps, secrets) and ingress setup (TLS, cert-manager, nginx ingress).

## 📁 Project Structure
```bash
├── app-deploy.yml # Main Ansible playbook
├── roles/
│ ├── app_deploy/ # Handles app deployments, services, configmaps, secrets, restores db
│ ├── cert_manager/ # Installs cert-manager and certificates
│ └── nginx_ingress_controller/ # Deploys nginx ingress controller
└── README.md # This file
```
- To run you can use this command:
```bash
ansible-galaxy collection install kubernetes.core && ansible-playbook app-deploy.yml
```
