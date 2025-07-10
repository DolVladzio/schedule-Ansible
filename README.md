# 🐙 Schedule Deployment with Ansible 

App Deploy - [![Run The Ansible Role: App Deploy](https://github.com/DolVladzio/schedule-Ansible/actions/workflows/app_deploy.yml/badge.svg?branch=main)](https://github.com/DolVladzio/schedule-Ansible/actions/workflows/app_deploy.yml)

Restore DB - [![Run The Ansible Role: Restore DB](https://github.com/DolVladzio/schedule-Ansible/actions/workflows/restore_db.yml/badge.svg?branch=main)](https://github.com/DolVladzio/schedule-Ansible/actions/workflows/restore_db.yml)

This project uses Ansible to automate the deployment of a Kubernetes-based application, including app components (deployments, services, configmaps, secrets) and ingress setup (TLS, cert-manager, nginx ingress).

## 📁 Project Structure
```bash
.
├── README.md
├── ansible.cfg
├── app_deploy.yml
├── group_vars
│   └── all.yml
├── ingress_deploy.yml
├── inventory
│   └── inventory.ini
├── restore_db.yml
└── roles
    ├── app_deploy
    ├── cert_manager
    ├── nginx_ingress_controller
    └── restore_db_from_dump
```