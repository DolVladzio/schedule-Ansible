// ###############################################################
def jobs = [
  // FRONTEND
  [name: 'prod-frontend', repo: 'https://github.com/DolVladzio/schedule_frontend.git', branch: '*/main', file_name: 'Jenkinsfiles/Jenkinsfile'],
  [name: 'dev-frontend',  repo: 'https://github.com/DolVladzio/schedule_frontend.git', branch: '*/dev',  file_name: 'Jenkinsfiles/dev-Jenkinsfile'],
  // BACKEND
  [name: 'prod-backend',  repo: 'https://github.com/DolVladzio/schedule_backend.git',  branch: '*/main', file_name: 'Jenkinsfiles/Jenkinsfile'],
  [name: 'dev-backend',   repo: 'https://github.com/DolVladzio/schedule_backend.git',  branch: '*/dev',  file_name: 'Jenkinsfiles/dev-Jenkinsfile'],
  // TERRAFORM_MODULES
  [name: 'terraform-modules', repo: 'https://github.com/DolVladzio/schedule-GCP.git', branch: '*/main', file_name: 'Jenkinsfile'],
  // ANSIBLE_ROLES
  [name: 'ansible-roles', repo: 'https://github.com/DolVladzio/schedule-Ansible.git', branch: '*/main', file_name: 'Jenkinsfile'],
  // ANSIBLE_JSON_CONFIG
  [name: 'ansible-config', repo: 'https://github.com/DolVladzio/schedule-ansible-config.git', branch: '*/main', file_name: 'Jenkinsfiles/Jenkinsfile'],
  [name: 'dev-ansible-config', repo: 'https://github.com/DolVladzio/schedule-ansible-config.git', branch: '*/dev',  file_name: 'Jenkinsfiles/dev-Jenkinsfile'],
  // TERRAFORM_JSON_CONFIG
  [name: 'terraform-config', repo: 'https://github.com/DolVladzio/schedule-terraform-config.git', branch: '*/main', file_name: 'Jenkinsfiles/Jenkinsfile'],
  [name: 'dev-terraform-config', repo: 'https://github.com/DolVladzio/schedule-terraform-config.git', branch: '*/dev',  file_name: 'Jenkinsfiles/dev-Jenkinsfile'],
]

jobs.each { job ->

  pipelineJob(job.name) {
    definition {
      cpsScm {
        scm {
          git {
            remote {
              url(job.repo)
            }
            branches(job.branch)
          }
        }
        scriptPath(job.file_name)
      }
    }
  }
}
// ###############################################################