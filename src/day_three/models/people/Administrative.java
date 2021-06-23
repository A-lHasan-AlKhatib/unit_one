package day_three.models.people;

import day_three.models.enums.Role;

public class Administrative extends Employee {
    private Role role;

    private Administrative() {
        super();
        role = Role.NONE;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public static class AdministrativeBuilder extends EmployeeBuilder<AdministrativeBuilder, Administrative> {

        public AdministrativeBuilder() {
            builderInstance = this;
            personInstance = new Administrative();
        }

        public AdministrativeBuilder setRole(Role role) {
            personInstance.setRole(role);
            return builderInstance;
        }

        @Override
        public Administrative build() {
            return personInstance;
        }
    }
}
