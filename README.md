# 🐙 Schedule Deployment with Ansible

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
