package use_case.clear_users;

import use_case.signup.SignupOutputData;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        String accounts = userDataAccessObject.getUsernames();
        userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(accounts);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
